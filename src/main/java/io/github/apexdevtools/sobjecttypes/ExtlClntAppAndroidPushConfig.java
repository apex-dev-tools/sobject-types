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
public class ExtlClntAppAndroidPushConfig extends SObject {
	public static SObjectType$<ExtlClntAppAndroidPushConfig> SObjectType;
	public static SObjectFields$<ExtlClntAppAndroidPushConfig> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id ExtlClntAppPushSettingsId;
	public ExtlClntAppPushSettings ExtlClntAppPushSettings;
	public String FcmProject;
	public Id Id;
	public Boolean IsCurrent;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ServiceAccount;
	public Datetime SystemModstamp;

	public ExtlClntAppAndroidPushConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppAndroidPushConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppAndroidPushConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppAndroidPushConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppAndroidPushConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
