<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
	#middle-login {
		margin-top: 30px;
	}
	
</style>
<div id="middle-login">
    <div class="headline_text">
        <h1 class="entry-title">My Account</h1>
    </div>
    <div class="cmsmasters_breadcrumbs">
        <div class="cmsmasters_breadcrumbs_aligner"></div>
        <div class="cmsmasters_breadcrumbs_inner"><a href="../index.html" class="cms_home">Home</a>
            <span class="breadcrumbs_sep"> / </span>
            <span>My Account</span>
        </div>
    </div>
</div>
<div class="content_wrap fullwidth">
    <!--_________________________ Start Content _________________________ -->
    <div class="middle_content entry">
        <div class="woocommerce">
            <h2>Login</h2>
            <form class="woocommerce-form woocommerce-form-login login" method="post">
                <p class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
                    <label for="username">Username or email address <span class="required">*</span></label>
                    <input type="text" class="woocommerce-Input woocommerce-Input--text input-text" name="username" id="username" value="" />
                </p>
                <p class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
                    <label for="password">Password <span class="required">*</span></label>
                    <input class="woocommerce-Input woocommerce-Input--text input-text" type="password" name="password" id="password" />
                </p>
                <p class="form-row">
                    <input type="hidden" id="woocommerce-login-nonce" name="woocommerce-login-nonce" value="3ea3eb0f9d" /><input type="hidden" name="_wp_http_referer" value="/my-account/" />				<input type="submit" class="woocommerce-Button button" name="login" value="Login" />
                    <label class="woocommerce-form__label woocommerce-form__label-for-checkbox inline">
                    <input class="woocommerce-form__input woocommerce-form__input-checkbox" name="rememberme" type="checkbox" id="rememberme" value="forever" /> <span>Remember me</span>
                    </label>
                </p>
                <p class="woocommerce-LostPassword lost_password">
                    <a href="http://localhost:8080/framgia-claim/resetpassword">Lost your password?</a>
                </p>
            </form>
        </div>
        <div class="cl"></div>
    </div>
    <!-- _________________________ Finish Content _________________________ -->
</div>