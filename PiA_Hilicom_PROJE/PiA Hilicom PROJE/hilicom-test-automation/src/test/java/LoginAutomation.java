import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginAutomation {

    @Test
    public void browserAcma() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Sayfayı Büyütme
        driver.manage().window().maximize();
        //Url e gitme
        driver.navigate().to("http://localhost:4200/");
        //driver.get("https://www.trendyol.com");

        //System.out.println("Giriş Yap Sayfasına Yönlendirme Başarılı");
        //driver.findElement(By.xpath("")).click(); //Giriş Yap tıkla
        System.out.println("Mail Alanına Tıklama Başarılı");
        driver.findElement(By.xpath("/html/body/app-root/app-login/body/div/form/div[1]/input")).click(); //Mail alanına tıkla
        Thread.sleep(2000); // 2 saniye bekle
        System.out.println("Mail Adresi Girişi Başarılı");
        Thread.sleep(2000); // 2 saniye bekle
        driver.findElement(By.xpath("/html/body/app-root/app-login/body/div/form/div[1]/input")).sendKeys("ozdekaymaz@hilicom.com"); //Mail adresi girme
        //System.out.println("İleri Butonuna Tıklama Başarılı");
        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[2]/span/span/input")).click(); //Continue tıkla

        System.out.println("Parola Alanına Tıklama Başarılı");
        driver.findElement(By.xpath("/html/body/app-root/app-login/body/div/form/div[2]/input")).click(); // Parola alanına tıkla
        Thread.sleep(2000); // 2 saniye bekle
        System.out.println("Parola Girişi Başarılı");
        driver.findElement(By.xpath("/html/body/app-root/app-login/body/div/form/div[2]/input")).sendKeys("ozde123"); //Parola gir
        Thread.sleep(2000); // 2 saniye bekle
        System.out.println("Login Butonuna Tıklama Başarılı");
        driver.findElement(By.xpath("/html/body/app-root/app-login/body/div/form/div[3]/button")).click(); //Giriş Yap Butonuna Tıkla
        Thread.sleep(2000); // 2 saniye bekle
        driver.findElement(By.xpath("/html/body/app-root/app-home/nav/div/div[2]/div/input")).click();
        Thread.sleep(2000); // 2 saniye bekle
        driver.findElement(By.xpath("/html/body/app-root/app-home/nav/div/div[2]/div/input")).sendKeys("yavuz");
        Thread.sleep(2000); // 2 saniye bekle
        driver.findElement(By.xpath("/html/body/app-root/app-home/nav/div/div[2]/button")).click();
        Thread.sleep(2000); // 2 saniye bekle
        driver.findElement(By.xpath("/html/body/app-root/app-home/nav/div/div[2]/div/div[2]/i")).click();
        Thread.sleep(2000); // 2 saniye bekle
        driver.findElement(By.xpath("/html/body/app-root/app-home/nav/div/div[2]/div/input")).sendKeys("542");
        Thread.sleep(2000); // 2 saniye bekle
        driver.findElement(By.xpath("/html/body/app-root/app-home/nav/div/div[2]/button")).click();

        driver.findElement(By.xpath("/html/body/app-root/app-sidebar/div/div[1]/i")).click();
        Thread.sleep(2000); // 2 saniye bekle
        driver.findElement(By.xpath("/html/body/app-root/app-sidebar/div/div[2]/nav/ul/li[5]/a")).click();
        Thread.sleep(2000); // 2 saniye bekle
        driver.findElement(By.xpath("/html/body/app-root/app-sidebar/div/div[1]/i")).click();
        Thread.sleep(2000); // 2 saniye bekle

        //INFRASTRUCTURE QUERY

        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[1]/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[1]/div[1]/input")).sendKeys("İzmir");
        Thread.sleep(2000);
        System.out.println("Şehir girildi");

        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[1]/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[1]/div[2]/input")).sendKeys("Karşıyaka");
        System.out.println("İlçe girildi");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[1]/div[3]/input")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[1]/div[3]/input")).sendKeys("Bostanlı");
        System.out.println("Mahalle girildi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[2]/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("6345");
        System.out.println("Sokak girildi");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[2]/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[2]/div[2]/input")).sendKeys("22");
        System.out.println("Numara girildi");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[2]/div[3]/input")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[1]/div[2]/div[3]/input")).sendKeys("4");
        System.out.println("Daire girildi");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/app-root/app-infrastructure/div/div[2]/div[2]/button")).click();
        System.out.println("Altyapı Tipi Check Edildi.");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/app-root/app-sidebar/div/div[1]/i")).click();
        Thread.sleep(2000); // 2 saniye bekle

        driver.findElement(By.xpath("/html/body/app-root/app-sidebar/div/div[2]/div[3]/a/div/div")).click();
        Thread.sleep(2000); // 2 saniye bekle







    }
}