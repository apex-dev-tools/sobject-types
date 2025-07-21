/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
