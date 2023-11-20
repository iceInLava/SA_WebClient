package Client;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

import java.util.Scanner;

public class MobileClientTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MobileCodeWS factory1 = new MobileCodeWS();
        MobileCodeWSSoap mobileCodeWSSoap = factory1.getMobileCodeWSSoap();
        String mobileCode = s.nextLine();
        String searchResult = mobileCodeWSSoap.getMobileCodeInfo(mobileCode, null);
        System.out.println("��ù����ֻ����������ʡ�ݡ��������ֻ���������Ϣ:" + searchResult);
    }
}

