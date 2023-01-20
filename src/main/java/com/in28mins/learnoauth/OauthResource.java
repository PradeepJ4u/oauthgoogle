package com.in28mins.learnoauth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthResource {
	
	@GetMapping("/")
	public String helloWorld(Authentication authentication) {
		System.out.println(authentication);
//OAuth2AuthenticationToken [Principal=Name: [104543570156573112518], Granted Authorities: [[OIDC_USER, SCOPE_https://www.googleapis.com/auth/userinfo.email, SCOPE_https://www.googleapis.com/auth/userinfo.profile, SCOPE_openid]], User Attributes: [{at_hash=-jxtFndrmhp0RWwyA_11xw, sub=104543570156573112518, email_verified=true, iss=https://accounts.google.com, given_name=Pradeep, locale=en, nonce=E8QkvzKrg4_wP3NZeF7XKqYY81cLu_5arWodkJsZ6og, picture=https://lh3.googleusercontent.com/a/AEdFTp6BLjjCy35p0cW6Hlkm82nagkyN4xGiXp0K7VWt83o=s96-c, aud=[441687938858-eeq8cn71i7paog49pblbdlnsau87pf32.apps.googleusercontent.com], azp=441687938858-eeq8cn71i7paog49pblbdlnsau87pf32.apps.googleusercontent.com, name=Pradeep Joshi, exp=2023-01-19T05:43:19Z, family_name=Joshi, iat=2023-01-19T04:43:19Z, email=pradeepjoshimca2006@gmail.com}], Credentials=[PROTECTED], Authenticated=true, Details=WebAuthenticationDetails [RemoteIpAddress=0:0:0:0:0:0:0:1, SessionId=0445C778F67B1F4FDF38CC2F0B430606], Granted Authorities=[OIDC_USER, SCOPE_https://www.googleapis.com/auth/userinfo.email, SCOPE_https://www.googleapis.com/auth/userinfo.profile, SCOPE_openid]]
		System.out.println(authentication.getPrincipal());
//Name: [104543570156573112518], Granted Authorities: [[OIDC_USER, SCOPE_https://www.googleapis.com/auth/userinfo.email, SCOPE_https://www.googleapis.com/auth/userinfo.profile, SCOPE_openid]], User Attributes: [{at_hash=-jxtFndrmhp0RWwyA_11xw, sub=104543570156573112518, email_verified=true, iss=https://accounts.google.com, given_name=Pradeep, locale=en, nonce=E8QkvzKrg4_wP3NZeF7XKqYY81cLu_5arWodkJsZ6og, picture=https://lh3.googleusercontent.com/a/AEdFTp6BLjjCy35p0cW6Hlkm82nagkyN4xGiXp0K7VWt83o=s96-c, aud=[441687938858-eeq8cn71i7paog49pblbdlnsau87pf32.apps.googleusercontent.com], azp=441687938858-eeq8cn71i7paog49pblbdlnsau87pf32.apps.googleusercontent.com, name=Pradeep Joshi, exp=2023-01-19T05:43:19Z, family_name=Joshi, iat=2023-01-19T04:43:19Z, email=pradeepjoshimca2006@gmail.com}]
		return "Hello World";
	}

}
