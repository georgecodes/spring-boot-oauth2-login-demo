This code is to support a [blog post](https://georgemcintosh.com/posts/oauth-pt1/) about OAuth2.

It's a simple Spring Boot app which requires that you log in with Github. Follow [these instructions](https://docs.github.com/en/developers/apps/building-oauth-apps/creating-an-oauth-app) to 
create an oauth app yourself, and fill in the relevant values in application.yml.

For completeness, there is a reverse proxy which will terminate TLS for you on https://lovelyapp.localtest.me

localtest.me is a handy wildcard DNS service which resolves all entries to 127.0.0.1

You may trust the CA certificate in proxy/certs/George_McIntosh_Blog_Root_CA_v1.crt if you wish to get a 
full, uninterrupted browser experience. Don't trust me? Good for you! In a future version I shall walk you through 
generating the certificates yourself using [certstrap](https://github.com/square/certstrap).