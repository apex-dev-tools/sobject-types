/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

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
	public com.nawforce.runforce.System.String MobileSessionTimeout;
	public com.nawforce.runforce.System.String MobileStartUrl;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Boolean OptionsAllowAdminApprovedUsersOnly;
	public com.nawforce.runforce.System.Boolean OptionsFullContentPushNotifications;
	public com.nawforce.runforce.System.Boolean OptionsHasSessionLevelPolicy;
	public com.nawforce.runforce.System.Boolean OptionsIsInternal;
	public com.nawforce.runforce.System.Boolean OptionsRefreshTokenValidityMetric;
	public com.nawforce.runforce.System.String PinLength;
	public com.nawforce.runforce.System.Integer RefreshTokenValidityPeriod;
	public com.nawforce.runforce.System.String StartUrl;
	public Datetime SystemModstamp;

	public InstalledMobileApp[] InstalledMobileApps;
	public SetupEntityAccess[] SetupEntityAccessItems;

	public ConnectedApplication clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConnectedApplication clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConnectedApplication clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConnectedApplication clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConnectedApplication clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
