package io.github.epam.tests;

import io.github.epam.SimpleTestsInit;
import org.testng.annotations.Test;

import static io.github.epam.EpamGithubSite.contactFormPage;
import static io.github.epam.EpamGithubSite.homePage;
import static io.github.epam.entities.Users.DEFAULT_USER;
import static io.github.epam.entities.Users.USER_WITH_CONTACTS;


public class FormTests extends SimpleTestsInit {

    @Test
    public void loginTest() {
        homePage.open();
        homePage.header.userIcon.click();
        homePage.header.loginForm.loginAs(DEFAULT_USER);
        homePage.checkOpened();
    }
    @Test
    public void fillContactFormTest() {
        homePage.open();
        homePage.header.userIcon.click();
        homePage.header.loginForm.loginAs(DEFAULT_USER);
        homePage.checkOpened();
        homePage.navigationSidebar.contactForm.click();
        contactFormPage.checkOpened();
        contactFormPage.main.contactForm.submit(USER_WITH_CONTACTS);
        contactFormPage.main.contactForm.verify(USER_WITH_CONTACTS);
    }
}
