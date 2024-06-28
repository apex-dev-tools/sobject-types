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
public class BenefitAction extends SObject {
	public static SObjectType$<BenefitAction> SObjectType;
	public static SObjectFields$<BenefitAction> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String FlowDefinition;
	public String FlowInstance;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsBenefitExpirationAllowed;
	public Boolean IsBenefitUpdateAllowed;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String MemberBenefitVariableName;
	public String NamespacePrefix;
	public String ProcessType;
	public Datetime SystemModstamp;
	public String Type;

	public Benefit[] BenefitActions;
	public BenefitActionParameter[] BenefitParameterActions;

	public BenefitAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public BenefitAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BenefitAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BenefitAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BenefitAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
