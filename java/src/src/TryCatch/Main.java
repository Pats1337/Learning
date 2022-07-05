package TryCatch;

import java.util.*;


public class Main {
    private static final String URL = "https://s410vla.storage.yandex.net/rdisk/7274033c7cc09f372b4847695154ca58d95f321342744024db62822204392a7d/62c42758/JUMBJlcv1fphVVpcdsyiIQDIC-jZJaW6PLECBG3HL-Q1dxr5oMyLMsK01ZFs7T9EbGvKss8yrH8imvdaEt1EUQ==?uid=517318275&filename=2022-04-12%2019-02-15.MOV&disposition=attachment&hash=&limit=0&content_type=video%2Fquicktime&owner_uid=517318275&fsize=11182712&hid=276c4df990797a22899c04385d25ce9b&media_type=video&tknv=v2&etag=063335f38da7bc18462fb19c23a69f58&rtoken=YoZY4eZRikbP&force_default=yes&ycrid=na-2a86df09562b52cbf176d18c892a328b-downloader16f&ts=5e30d91568600&s=cd69b96d7bda6a176ec3c39a75f8ceba3bfbfc5de15968a616fe9c32e9098620&pb=U2FsdGVkX1_oIerarZTYJeJbs2URz_INyASg8sa89QL4Q1qHwKwJLSApH0hJ3BEJoCUIKE2V9QG_QgEGFBFQ5K-hTG4mYMFLz3Urmgx9pEM";

    public static void main(String[] args) {
        System.out.println("Starting at " + new Date());
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            threads.add((new DownloadFile(URL, i + "video.mp4", i)));
        }
        for (Thread thread : threads){
            thread.start();
        }
        System.out.println("Finishing main thread at " + new Date());
    }
}
