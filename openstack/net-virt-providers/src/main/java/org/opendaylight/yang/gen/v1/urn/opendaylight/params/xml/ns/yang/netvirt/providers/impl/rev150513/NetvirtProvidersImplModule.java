package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.netvirt.providers.impl.rev150513;

import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;
import org.opendaylight.ovsdb.openstack.netvirt.providers.NetvirtProvidersProvider;
import org.osgi.framework.BundleContext;

public class NetvirtProvidersImplModule extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.netvirt.providers.impl.rev150513.AbstractNetvirtProvidersImplModule {
    private BundleContext bundleContext = null;

    public NetvirtProvidersImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public NetvirtProvidersImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.netvirt.providers.impl.rev150513.NetvirtProvidersImplModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        NetvirtProvidersProvider provider = new NetvirtProvidersProvider(bundleContext);
        BindingAwareBroker localBroker = getBrokerDependency();
        localBroker.registerProvider(provider);
        return provider;
    }

    public void setBundleContext(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }
}
