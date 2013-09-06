package spike.rmi;

import java.util.ArrayList;
import java.util.List;

import org.googlecode.rmilbclient.RmiProxyFactoryBean;

public class SpikeRmiProxyFactoryBean extends RmiProxyFactoryBean {

    private final String beanName;

    public SpikeRmiProxyFactoryBean(String beanName) {
        this.beanName = beanName;
    }

    public List<String> getServiceUrls(){
        return getConfig().getServiceUrls();
    }

    public void setServiceUrlList(String serverURIs) {
        getConfig().setServiceUrls(parseUrls(serverURIs));
    }

    private List<String> parseUrls(String serverURIs) {
        List<String> urlList = new ArrayList<String>();
        for (String uri : serverURIs.split(",")) {
            urlList.add("rmi://" + uri + "/" + beanName);
        }
        return urlList;
    }
}
