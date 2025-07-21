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
public class ExtlClntAppApplePushConfig extends SObject {
	public static SObjectType$<ExtlClntAppApplePushConfig> SObjectType;
	public static SObjectFields$<ExtlClntAppApplePushConfig> Fields;

	public String ApplicationBundle;
	public String Certificate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Environment;
	public Id ExtlClntAppPushSettingsId;
	public ExtlClntAppPushSettings ExtlClntAppPushSettings;
	public Id Id;
	public Boolean IsCurrent;
	public Boolean IsDeleted;
	public String KeyIdentifier;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Password;
	public String SigningKey;
	public Datetime SystemModstamp;
	public String TeamIdentifier;

	public ExtlClntAppApplePushConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppApplePushConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppApplePushConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppApplePushConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppApplePushConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
