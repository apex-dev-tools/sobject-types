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
public class PlanBenefitItemChangeEvent extends SObject {
	public static SObjectType$<PlanBenefitItemChangeEvent> SObjectType;
	public static SObjectFields$<PlanBenefitItemChangeEvent> Fields;

	public String BenefitCategory;
	public Object ChangeEventHeader;
	public String CoverageLevel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Decimal InNetworkCoverage;
	public Boolean IsInPlanNetwork;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Notes;
	public Decimal OutofNetworkCoverage;
	public Id OwnerId;
	public User Owner;
	public Id PlanBenefitId;
	public PlanBenefit PlanBenefit;
	public String ReplayId;
	public String ServiceType;
	public String ServiceTypeCode;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String TimePeriod;

	public PlanBenefitItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefitItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefitItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefitItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefitItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
