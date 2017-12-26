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
<div class="middle_inner">
    <div class="content_wrap fullwidth">
        <!--_________________________ Start Content _________________________ -->
        <div class="middle_content entry">
            <div class="woocommerce">
                <form method="post" class="woocommerce-ResetPassword lost_reset_password">
                    <p>Lost your password? Please enter your username or email address. You will receive a link to create a new password via email.</p>
                    <p class="woocommerce-form-row woocommerce-form-row--first form-row form-row-first">
                        <label for="user_login">Username or email</label>
                        <input class="woocommerce-Input woocommerce-Input--text input-text" type="text" name="user_login" id="user_login">
                    </p>
                    <div class="clear"></div>
                    <p class="woocommerce-form-row form-row">
                        <input type="hidden" name="wc_reset_password" value="true">
                        <input type="submit" class="woocommerce-Button button" value="Reset password">
                    </p>
                    <input type="hidden" id="_wpnonce" name="_wpnonce" value="a2257316f9"><input type="hidden" name="_wp_http_referer" value="/my-account/lost-password/">
                </form>
            </div>
            <div class="cl"></div>
        </div>
        <!-- _________________________ Finish Content _________________________ -->
    </div>
</div>