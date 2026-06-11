/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class NetworkAuthApiSettings extends SObject {
	public static SObjectType$<NetworkAuthApiSettings> SObjectType;
	public static SObjectFields$<NetworkAuthApiSettings> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id CustomOtpDeliveryHandlerId;
	public ApexClass CustomOtpDeliveryHandler;
	public Boolean DoesForgotPasswordRequireAuth;
	public Boolean DoesPasswordLoginRequireAuth;
	public Boolean DoesPwdlessLoginRequireAuth;
	public Boolean DoesRegistrationRequireAuth;
	public Id HeadlessDiscoveryExecutionUserId;
	public User HeadlessDiscoveryExecutionUser;
	public Id HeadlessDiscoveryHandlerId;
	public ApexClass HeadlessDiscoveryHandler;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsFirstPartyAppsAllowed;
	public Boolean IsForgotPwdAllowed;
	public Boolean IsForgotPwdEmailTemplateAllowlistingEnabled;
	public Boolean IsHeadlessUserRegistrationAllowed;
	public Boolean IsPwdlessLoginAllowed;
	public Boolean IsRecaptchaRequiredForgotPwd;
	public Boolean IsRecaptchaRequiredPwdlessLogin;
	public Boolean IsRecaptchaRequiredRgstr;
	public Boolean IsUniversalClientRgstrAllowed;
	public Boolean IsUserDisambiguationAllowedForgotPwd;
	public Boolean IsUserDisambiguationAllowedUsernamePwd;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MaxPasswordResetAttempts;
	public Id NetworkId;
	public Network Network;
	public Decimal RecaptchaScoreThreshold;
	public Blob RecaptchaSecretKey;
	public Id RegistrationExecutionUserId;
	public User RegistrationExecutionUser;
	public Id RegistrationHandlerId;
	public ApexClass RegistrationHandler;
	public Id RegistrationUserDefaultProfileId;
	public Profile RegistrationUserDefaultProfile;
	public Datetime SystemModstamp;

	public NetworkAuthApiSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public NetworkAuthApiSettings clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NetworkAuthApiSettings clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NetworkAuthApiSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NetworkAuthApiSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
