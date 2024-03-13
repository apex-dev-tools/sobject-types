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
public class PrivacyPolicyDefinition extends SObject {
	public static SObjectType$<PrivacyPolicyDefinition> SObjectType;
	public static SObjectFields$<PrivacyPolicyDefinition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String RunFrequency;
	public Datetime ScheduledStart;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;

	public PrivacyJobSession[] PrivacyJobSessions;
	public PrivacyRTBFRequest[] PrivacyRTBFPolicies;

	public PrivacyPolicyDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public PrivacyPolicyDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyPolicyDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyPolicyDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyPolicyDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
