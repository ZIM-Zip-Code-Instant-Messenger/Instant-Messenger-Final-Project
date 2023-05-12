import { AuthConfig } from "angular-oauth2-oidc";

export const authConfig: AuthConfig = {
  issuer: 'https://accounts.google.com',
  redirectUri: 'http://localhost:4200/',
  clientId: 'YOUR_APPLICATION_CLIENT_ID.apps.googleusercontent.com',
  scope: 'openid profile email',
  clearHashAfterLogin: false,
  strictDiscoveryDocumentValidation: false
};