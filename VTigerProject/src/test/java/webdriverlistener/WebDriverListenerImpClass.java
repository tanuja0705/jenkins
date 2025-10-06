package webdriverlistener;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.events.WebDriverListener;

public class WebDriverListenerImpClass implements WebDriverListener{
	 @Override
	    public void beforeClick(WebElement element) {
	        System.out.println("Before clicking on: " + element);
	    }

	    @Override
	public void beforeAnyCall(Object target, Method method, Object[] args) {
		System.out.println("beforeAnyCall");
	}

	@Override
	public void afterAnyCall(Object target, Method method, Object[] args, Object result) {
		System.out.println("afterAnyCall");
	}

	@Override
	public void beforeAnyWebDriverCall(WebDriver driver, Method method, Object[] args) {
		System.out.println("beforeAnyWebDriverCall");
	}

	@Override
	public void afterAnyWebDriverCall(WebDriver driver, Method method, Object[] args, Object result) {
		System.out.println("afterAnyWebDriverCall");
	}

	@Override
	public void beforeGet(WebDriver driver, String url) {
		System.out.println("beforeGet");
	}

	@Override
	public void afterGet(WebDriver driver, String url) {
		System.out.println("afterGet");
	}

	@Override
	public void beforeGetCurrentUrl(WebDriver driver) {
		System.out.println("beforeGetCurrentUrl");
	}

	@Override
	public void afterGetCurrentUrl(WebDriver driver, String result) {
		System.out.println("afterGetCurrentUrl");
	}

	@Override
	public void beforeGetTitle(WebDriver driver) {
		System.out.println("beforeGetTitle");
	}

	@Override
	public void afterGetTitle(WebDriver driver, String result) {
		System.out.println("afterGetTitle");
	}

	@Override
	public void beforeFindElements(WebDriver driver, By locator) {
		System.out.println("beforeFindElements");
	}

	@Override
	public void afterFindElements(WebDriver driver, By locator, List<WebElement> result) {
		System.out.println("afterFindElements");
	}

	@Override
	public void beforeGetPageSource(WebDriver driver) {
		System.out.println("beforeGetPageSource");
	}

	@Override
	public void afterGetPageSource(WebDriver driver, String result) {
		System.out.println("afterGetPageSource");
	}

	@Override
	public void beforeClose(WebDriver driver) {
		System.out.println("beforeClose");
	}

	@Override
	public void afterClose(WebDriver driver) {
		System.out.println("afterClose");
	}

	@Override
	public void beforeQuit(WebDriver driver) {
		System.out.println("beforeQuit");
	}

	@Override
	public void afterQuit(WebDriver driver) {
		System.out.println("afterQuit");
	}

	@Override
	public void beforeGetWindowHandles(WebDriver driver) {
		System.out.println("beforeGetWindowHandles");
	}

	@Override
	public void afterGetWindowHandles(WebDriver driver, Set<String> result) {
		System.out.println("afterGetWindowHandles");
	}

	@Override
	public void beforeGetWindowHandle(WebDriver driver) {
		System.out.println("beforeGetWindowHandle");
	}

	@Override
	public void afterGetWindowHandle(WebDriver driver, String result) {
		System.out.println("afterGetWindowHandle");
	}

	@Override
	public void beforeExecuteScript(WebDriver driver, String script, Object[] args) {
		System.out.println("beforeExecuteScript");
	}

	@Override
	public void afterExecuteScript(WebDriver driver, String script, Object[] args, Object result) {
		System.out.println("afterExecuteScript");
	}

	@Override
	public void beforeExecuteAsyncScript(WebDriver driver, String script, Object[] args) {
		System.out.println("beforeExecuteAsyncScript");
	}

	@Override
	public void afterExecuteAsyncScript(WebDriver driver, String script, Object[] args, Object result) {
		System.out.println("afterExecuteAsyncScript");
	}

	@Override
	public void beforePerform(WebDriver driver, Collection<Sequence> actions) {
		System.out.println("beforePerform");
	}

	@Override
	public void afterPerform(WebDriver driver, Collection<Sequence> actions) {
		System.out.println("afterPerform");
	}

	@Override
	public void beforeResetInputState(WebDriver driver) {
		System.out.println("beforeResetInputState");
	}

	@Override
	public void afterResetInputState(WebDriver driver) {
		System.out.println("afterResetInputState");
	}

	@Override
	public void beforeAnyWebElementCall(WebElement element, Method method, Object[] args) {
		System.out.println("beforeAnyWebElementCall");
	}

	@Override
	public void afterAnyWebElementCall(WebElement element, Method method, Object[] args, Object result) {
		System.out.println("afterAnyWebElementCall");
	}

	@Override
	public void beforeSubmit(WebElement element) {
		System.out.println("beforeSubmit");
	}

	@Override
	public void afterSubmit(WebElement element) {
		System.out.println("afterSubmit");
	}

	@Override
	public void beforeClear(WebElement element) {
		System.out.println("beforeClear");
	}

	@Override
	public void afterClear(WebElement element) {
		System.out.println("afterClear");
	}

	@Override
	public void beforeGetTagName(WebElement element) {
		System.out.println("beforeGetTagName");
	}

	@Override
	public void afterGetTagName(WebElement element, String result) {
		System.out.println("afterGetTagName");
	}

	@Override
	public void beforeGetAttribute(WebElement element, String name) {
		System.out.println("beforeGetAttribute");
	}

	@Override
	public void afterGetAttribute(WebElement element, String name, String result) {
		System.out.println("afterGetAttribute");
	}

	@Override
	public void beforeIsSelected(WebElement element) {
		System.out.println("beforeIsSelected");
	}

	@Override
	public void afterIsSelected(WebElement element, boolean result) {
		System.out.println("afterIsSelected");
	}

	@Override
	public void beforeIsEnabled(WebElement element) {
		System.out.println("beforeIsEnabled");
	}

	@Override
	public void afterIsEnabled(WebElement element, boolean result) {
		System.out.println("afterIsEnabled");
	}

	@Override
	public void beforeGetText(WebElement element) {
		System.out.println("beforeGetText");
	}

	@Override
	public void afterGetText(WebElement element, String result) {
		System.out.println("afterGetText");
	}

	@Override
	public void beforeFindElement(WebElement element, By locator) {
		System.out.println("beforeFindElement");
	}

	@Override
	public void afterFindElement(WebElement element, By locator, WebElement result) {
		System.out.println("afterFindElement");
	}

	@Override
	public void beforeFindElements(WebElement element, By locator) {
		System.out.println("beforeFindElements");
	}

	@Override
	public void afterFindElements(WebElement element, By locator, List<WebElement> result) {
		System.out.println("afterFindElements");
	}

	@Override
	public void beforeIsDisplayed(WebElement element) {
		System.out.println("beforeIsDisplayed");
	}

	@Override
	public void afterIsDisplayed(WebElement element, boolean result) {
		System.out.println("afterIsDisplayed");
	}

	@Override
	public void beforeGetLocation(WebElement element) {
		System.out.println("beforeGetLocation");
	}

	@Override
	public void afterGetLocation(WebElement element, Point result) {
		System.out.println("afterGetLocation");
	}

	@Override
	public void beforeGetSize(WebElement element) {
		System.out.println("beforeGetSize");
	}

	@Override
	public void afterGetSize(WebElement element, Dimension result) {
		System.out.println("afterGetSize");
	}

	@Override
	public void beforeGetCssValue(WebElement element, String propertyName) {
		System.out.println("beforeGetCssValue");
	}

	@Override
	public void afterGetCssValue(WebElement element, String propertyName, String result) {
		System.out.println("afterGetCssValue");
	}

	@Override
	public void beforeAnyNavigationCall(Navigation navigation, Method method, Object[] args) {
		System.out.println("beforeAnyNavigationCall");
	}

	@Override
	public void afterAnyNavigationCall(Navigation navigation, Method method, Object[] args, Object result) {
		System.out.println("afterAnyNavigationCall");
	}

	@Override
	public void beforeTo(Navigation navigation, String url) {
		System.out.println("beforeTo");
	}

	@Override
	public void afterTo(Navigation navigation, String url) {
		System.out.println("afterTo");
	}

	@Override
	public void beforeTo(Navigation navigation, URL url) {
		System.out.println("beforeTo url");
	}

	@Override
	public void afterTo(Navigation navigation, URL url) {
		System.out.println("afterTo url");
	}

	@Override
	public void beforeBack(Navigation navigation) {
		System.out.println("beforeBack");
	}

	@Override
	public void afterBack(Navigation navigation) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterBack(navigation);
	}

	@Override
	public void beforeForward(Navigation navigation) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeForward(navigation);
	}

	@Override
	public void afterForward(Navigation navigation) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterForward(navigation);
	}

	@Override
	public void beforeRefresh(Navigation navigation) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeRefresh(navigation);
	}

	@Override
	public void afterRefresh(Navigation navigation) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterRefresh(navigation);
	}

	@Override
	public void beforeAnyAlertCall(Alert alert, Method method, Object[] args) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeAnyAlertCall(alert, method, args);
	}

	@Override
	public void afterAnyAlertCall(Alert alert, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterAnyAlertCall(alert, method, args, result);
	}

	@Override
	public void beforeAccept(Alert alert) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeAccept(alert);
	}

	@Override
	public void afterAccept(Alert alert) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterAccept(alert);
	}

	@Override
	public void beforeDismiss(Alert alert) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeDismiss(alert);
	}

	@Override
	public void afterDismiss(Alert alert) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterDismiss(alert);
	}

	@Override
	public void beforeGetText(Alert alert) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeGetText(alert);
	}

	@Override
	public void afterGetText(Alert alert, String result) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterGetText(alert, result);
	}

	@Override
	public void beforeSendKeys(Alert alert, String text) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeSendKeys(alert, text);
	}

	@Override
	public void afterSendKeys(Alert alert, String text) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterSendKeys(alert, text);
	}

	@Override
	public void beforeAnyOptionsCall(Options options, Method method, Object[] args) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeAnyOptionsCall(options, method, args);
	}

	@Override
	public void afterAnyOptionsCall(Options options, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterAnyOptionsCall(options, method, args, result);
	}

	@Override
	public void beforeAddCookie(Options options, Cookie cookie) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeAddCookie(options, cookie);
	}

	@Override
	public void afterAddCookie(Options options, Cookie cookie) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterAddCookie(options, cookie);
	}

	@Override
	public void beforeDeleteCookieNamed(Options options, String name) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeDeleteCookieNamed(options, name);
	}

	@Override
	public void afterDeleteCookieNamed(Options options, String name) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterDeleteCookieNamed(options, name);
	}

	@Override
	public void beforeDeleteCookie(Options options, Cookie cookie) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeDeleteCookie(options, cookie);
	}

	@Override
	public void afterDeleteCookie(Options options, Cookie cookie) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterDeleteCookie(options, cookie);
	}

	@Override
	public void beforeDeleteAllCookies(Options options) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeDeleteAllCookies(options);
	}

	@Override
	public void afterDeleteAllCookies(Options options) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterDeleteAllCookies(options);
	}

	@Override
	public void beforeGetCookies(Options options) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeGetCookies(options);
	}

	@Override
	public void afterGetCookies(Options options, Set<Cookie> result) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterGetCookies(options, result);
	}

	@Override
	public void beforeGetCookieNamed(Options options, String name) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeGetCookieNamed(options, name);
	}

	@Override
	public void afterGetCookieNamed(Options options, String name, Cookie result) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterGetCookieNamed(options, name, result);
	}

	@Override
	public void beforeAnyTimeoutsCall(Timeouts timeouts, Method method, Object[] args) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeAnyTimeoutsCall(timeouts, method, args);
	}

	@Override
	public void afterAnyTimeoutsCall(Timeouts timeouts, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterAnyTimeoutsCall(timeouts, method, args, result);
	}

	@Override
	public void beforeImplicitlyWait(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeImplicitlyWait(timeouts, duration);
	}

	@Override
	public void afterImplicitlyWait(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterImplicitlyWait(timeouts, duration);
	}

	@Override
	public void beforeSetScriptTimeout(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeSetScriptTimeout(timeouts, duration);
	}

	@Override
	public void afterSetScriptTimeout(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterSetScriptTimeout(timeouts, duration);
	}

	@Override
	public void beforePageLoadTimeout(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforePageLoadTimeout(timeouts, duration);
	}

	@Override
	public void afterPageLoadTimeout(Timeouts timeouts, Duration duration) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterPageLoadTimeout(timeouts, duration);
	}

	@Override
	public void beforeAnyWindowCall(Window window, Method method, Object[] args) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeAnyWindowCall(window, method, args);
	}

	@Override
	public void afterAnyWindowCall(Window window, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterAnyWindowCall(window, method, args, result);
	}

	@Override
	public void beforeGetSize(Window window) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeGetSize(window);
	}

	@Override
	public void afterGetSize(Window window, Dimension result) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterGetSize(window, result);
	}

	@Override
	public void beforeSetSize(Window window, Dimension size) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeSetSize(window, size);
	}

	@Override
	public void afterSetSize(Window window, Dimension size) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterSetSize(window, size);
	}

	@Override
	public void beforeGetPosition(Window window) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeGetPosition(window);
	}

	@Override
	public void afterGetPosition(Window window, Point result) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterGetPosition(window, result);
	}

	@Override
	public void beforeSetPosition(Window window, Point position) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeSetPosition(window, position);
	}

	@Override
	public void afterSetPosition(Window window, Point position) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterSetPosition(window, position);
	}

	@Override
	public void beforeMaximize(Window window) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeMaximize(window);
	}

	@Override
	public void afterMaximize(Window window) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterMaximize(window);
	}

	@Override
	public void beforeFullscreen(Window window) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeFullscreen(window);
	}

	@Override
	public void afterFullscreen(Window window) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterFullscreen(window);
	}

	@Override
	public void beforeAnyTargetLocatorCall(TargetLocator targetLocator, Method method, Object[] args) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeAnyTargetLocatorCall(targetLocator, method, args);
	}

	@Override
	public void afterAnyTargetLocatorCall(TargetLocator targetLocator, Method method, Object[] args, Object result) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterAnyTargetLocatorCall(targetLocator, method, args, result);
	}

	@Override
	public void beforeFrame(TargetLocator targetLocator, int index) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeFrame(targetLocator, index);
	}

	@Override
	public void afterFrame(TargetLocator targetLocator, int index, WebDriver driver) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterFrame(targetLocator, index, driver);
	}

	@Override
	public void beforeFrame(TargetLocator targetLocator, String nameOrId) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeFrame(targetLocator, nameOrId);
	}

	@Override
	public void afterFrame(TargetLocator targetLocator, String nameOrId, WebDriver driver) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterFrame(targetLocator, nameOrId, driver);
	}

	@Override
	public void beforeFrame(TargetLocator targetLocator, WebElement frameElement) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeFrame(targetLocator, frameElement);
	}

	@Override
	public void afterFrame(TargetLocator targetLocator, WebElement frameElement, WebDriver driver) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterFrame(targetLocator, frameElement, driver);
	}

	@Override
	public void beforeParentFrame(TargetLocator targetLocator) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeParentFrame(targetLocator);
	}

	@Override
	public void afterParentFrame(TargetLocator targetLocator, WebDriver driver) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterParentFrame(targetLocator, driver);
	}

	@Override
	public void beforeWindow(TargetLocator targetLocator, String nameOrHandle) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeWindow(targetLocator, nameOrHandle);
	}

	@Override
	public void afterWindow(TargetLocator targetLocator, String nameOrHandle, WebDriver driver) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterWindow(targetLocator, nameOrHandle, driver);
	}

	@Override
	public void beforeNewWindow(TargetLocator targetLocator, WindowType typeHint) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeNewWindow(targetLocator, typeHint);
	}

	@Override
	public void afterNewWindow(TargetLocator targetLocator, WindowType typeHint, WebDriver driver) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterNewWindow(targetLocator, typeHint, driver);
	}

	@Override
	public void beforeDefaultContent(TargetLocator targetLocator) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeDefaultContent(targetLocator);
	}

	@Override
	public void afterDefaultContent(TargetLocator targetLocator, WebDriver driver) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterDefaultContent(targetLocator, driver);
	}

	@Override
	public void beforeActiveElement(TargetLocator targetLocator) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeActiveElement(targetLocator);
	}

	@Override
	public void afterActiveElement(TargetLocator targetLocator, WebDriver driver) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterActiveElement(targetLocator, driver);
	}

	@Override
	public void beforeAlert(TargetLocator targetLocator) {
		// TODO Auto-generated method stub
		WebDriverListener.super.beforeAlert(targetLocator);
	}

	@Override
	public void afterAlert(TargetLocator targetLocator, Alert alert) {
		// TODO Auto-generated method stub
		WebDriverListener.super.afterAlert(targetLocator, alert);
	}

		@Override
	    public void afterClick(WebElement element) {
	        System.out.println("After clicking on: " + element);
	    }

	    @Override
	    public void beforeFindElement(WebDriver driver, By locator) {
	        System.out.println("Trying to find element: " + locator);
	    }

	    @Override
	    public void afterFindElement(WebDriver driver, By locator, WebElement result) {
	        System.out.println("Found element: " + locator);
	    }
	    
	    @Override
	    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
	    	System.out.println("Before sendKeysss");
	    }
	    
	    @Override
	    public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
	    	System.out.println("After sendkeys");
	    }
	    
	    @Override
	    public void onError(Object target, java.lang.reflect.Method method, Object[] args, InvocationTargetException e) {
	        System.out.println("⚠️ Error occurred: " + e.getCause());
	        // Example: Take screenshot here
	        if (target instanceof WebDriver driver) {
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            File screenshot = ts.getScreenshotAs(OutputType.FILE);
	            // save screenshot to file or reporting system
	            File f = new File("./testData/as.png");
	            try {
					FileHandler.copy(screenshot,f);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        }
	    }
}

