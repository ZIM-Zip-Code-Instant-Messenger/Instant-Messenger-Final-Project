import { AuthConfig } from "angular-oauth2-oidc";

export const authConfig: AuthConfig = {
  issuer: 'https://accounts.google.com',
  redirectUri: 'https://localhost:4200/messenger-main',
  clientId: '136426780202-1f11rd3edilul5k0bvuaeh97hr6tnntl.apps.googleusercontent.com',
  scope: 'openid profile email',
  clearHashAfterLogin: false,
  strictDiscoveryDocumentValidation: false
};