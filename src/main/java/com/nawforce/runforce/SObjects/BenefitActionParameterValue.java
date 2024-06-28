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
public class BenefitActionParameterValue extends SObject {
	public static SObjectType$<BenefitActionParameterValue> SObjectType;
	public static SObjectFields$<BenefitActionParameterValue> Fields;

	public Id BenefitActionParameterId;
	public BenefitActionParameter BenefitActionParameter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ParameterValue;
	public Datetime SystemModstamp;

	public BenefitActionParameterValue clone$() {throw new java.lang.UnsupportedOperationException();}
	public BenefitActionParameterValue clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BenefitActionParameterValue clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BenefitActionParameterValue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BenefitActionParameterValue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
