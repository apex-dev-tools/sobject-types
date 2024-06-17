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
public class MobileSecurityPolicy extends SObject {
	public static SObjectType$<MobileSecurityPolicy> SObjectType;
	public static SObjectFields$<MobileSecurityPolicy> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Datetime EffectiveDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String MobilePlatform;
	public Id MobileSecurityAssignmentId;
	public MobileSecurityAssignment MobileSecurityAssignment;
	public String NamespacePrefix;
	public String RuleValue;
	public String RuleValueType;
	public String SeverityLevel;
	public Datetime SystemModstamp;
	public String Type;

	public MobileSecurityPolicy clone$() {throw new java.lang.UnsupportedOperationException();}
	public MobileSecurityPolicy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MobileSecurityPolicy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MobileSecurityPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MobileSecurityPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
