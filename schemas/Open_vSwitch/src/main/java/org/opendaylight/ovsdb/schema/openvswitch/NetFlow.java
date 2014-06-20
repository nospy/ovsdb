/*
 * Copyright (C) 2013 Red Hat, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Authors : Madhu Venugopal
 */
package org.opendaylight.ovsdb.schema.openvswitch;

import java.util.Set;

import org.opendaylight.ovsdb.lib.notation.Column;
import org.opendaylight.ovsdb.lib.schema.GenericTableSchema;
import org.opendaylight.ovsdb.lib.schema.typed.MethodType;
import org.opendaylight.ovsdb.lib.schema.typed.TypedBaseTable;
import org.opendaylight.ovsdb.lib.schema.typed.TypedColumn;
import org.opendaylight.ovsdb.lib.schema.typed.TypedTable;


/*
 * Reusing the existing Table definitions and many of columns are not defined here
 * TODO : Fill up the missing Columns and include Supported DB Version
 */
@TypedTable(name="NetFlow", database="Open_vSwitch")
public interface NetFlow extends TypedBaseTable {
    @TypedColumn(name="targets", method=MethodType.GETCOLUMN)
    public Column<GenericTableSchema, Set<String>> getTargetsColumn() ;
    @TypedColumn(name="targets", method=MethodType.SETDATA)
    public void setTargets(Set<String> targets) ;

    @TypedColumn(name="active_timeout", method=MethodType.GETCOLUMN)
    public Column<GenericTableSchema, Integer> getActiveTimeoutColumn() ;
    @TypedColumn(name="active_timeout", method=MethodType.SETDATA)
    public void setActiveTimeout(Integer activeTimeout) ;
}