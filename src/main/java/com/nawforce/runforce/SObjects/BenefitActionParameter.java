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
public class BenefitActionParameter extends SObject {
	public static SObjectType$<BenefitActionParameter> SObjectType;
	public static SObjectFields$<BenefitActionParameter> Fields;

	public Id BenefitActionId;
	public BenefitAction BenefitAction;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String ObjectName;
	public String PicklistName;
	public Datetime SystemModstamp;

	public BenefitParameterValue[] BenefitActionParameters;

	public BenefitActionParameter clone$() {throw new java.lang.UnsupportedOperationException();}
	public BenefitActionParameter clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BenefitActionParameter clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BenefitActionParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BenefitActionParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
