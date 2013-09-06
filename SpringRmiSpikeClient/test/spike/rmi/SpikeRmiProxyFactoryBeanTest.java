package spike.rmi;

import org.googlecode.rmilbclient.RmiLbServiceConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SpikeRmiProxyFactoryBeanTest {
    SpikeRmiProxyFactoryBean bean;

    @Before
    public void setUp(){
        bean = new SpikeRmiProxyFactoryBean("AuthenticationSpring");
        bean.setConfig(new RmiLbServiceConfig<Object>());
    }

    @Test
    public void shouldSetOneServiceUrl(){
        bean.setServiceUrlList("xldcat08:1099");
        List<String> urls = bean.getServiceUrls();
        assertEquals("rmi://xldcat08:1099/AuthenticationSpring", urls.get(0));
    }

    @Test
    public void shouldSetMultipleServiceUrls(){
        bean.setServiceUrlList("xldcat08:1099,localhost:1099");
        List<String> urls = bean.getServiceUrls();
        assertEquals("rmi://xldcat08:1099/AuthenticationSpring", urls.get(0));
        assertEquals("rmi://localhost:1099/AuthenticationSpring", urls.get(1));
    }
}
