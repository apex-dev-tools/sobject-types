/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ExtlClntAppSampleSettings extends SObject {
	public static SObjectType$<ExtlClntAppSampleSettings> SObjectType;
	public static SObjectFields$<ExtlClntAppSampleSettings> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Boolean DevManagedPolicyFieldsPolicy1;
	public Boolean DevManagedPolicyFieldsPolicy2;
	public String DeveloperName;
	public String DevicePlatform;
	public String DeviceType;
	public Id ExternalClientApplicationId;
	public ExternalClientApplication ExternalClientApplication;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String MinimumOsVersion;
	public String NamespacePrefix;
	public String Policy1;
	public String Policy2;
	public Datetime SystemModstamp;
	public String Version;

	public ExtlClntAppSampleSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppSampleSettings clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppSampleSettings clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppSampleSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppSampleSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
