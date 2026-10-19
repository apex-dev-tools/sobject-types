/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MobilePushServiceDevice extends SObject {
	public static SObjectType$<MobilePushServiceDevice> SObjectType;
	public static SObjectFields$<MobilePushServiceDevice> Fields;

	public String ApplicationBundle;
	public Id ApplicationId;
	public ExternalClientApplication Application;
	public String ApplicationName;
	public String ConnectionToken;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastSubscribed;
	public String NamespacePrefix;
	public Id NetworkId;
	public Network Network;
	public String ServiceType;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public MobilePushServiceDevice clone$() {throw new java.lang.UnsupportedOperationException();}
	public MobilePushServiceDevice clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MobilePushServiceDevice clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MobilePushServiceDevice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MobilePushServiceDevice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
