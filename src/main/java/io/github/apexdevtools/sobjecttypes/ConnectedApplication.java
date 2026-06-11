/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ConnectedApplication extends SObject {
	public static SObjectType$<ConnectedApplication> SObjectType;
	public static SObjectFields$<ConnectedApplication> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MobileSessionTimeout;
	public String MobileStartUrl;
	public String Name;
	public String NamedUserUvidTimeout;
	public Boolean OptionsAllowAdminApprovedUsersOnly;
	public Boolean OptionsAllowExpiredUvidJWT;
	public Boolean OptionsAppIssueJwtTokenEnabled;
	public Boolean OptionsCodeCredentialGuestEnabled;
	public Boolean OptionsFullContentPushNotifications;
	public Boolean OptionsHasSessionLevelPolicy;
	public Boolean OptionsIsInternal;
	public Boolean OptionsRefreshTokenValidityMetric;
	public Boolean OptionsTokenExchangeManageBitEnabled;
	public String PinLength;
	public Integer RefreshTokenValidityPeriod;
	public String StartUrl;
	public Datetime SystemModstamp;
	public String UvidTimeout;

	public InstalledMobileApp[] InstalledMobileApps;
	public SetupEntityAccess[] SetupEntityAccessItems;

	public ConnectedApplication clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConnectedApplication clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConnectedApplication clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConnectedApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConnectedApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
