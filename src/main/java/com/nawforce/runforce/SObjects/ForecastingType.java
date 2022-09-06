/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ForecastingType extends SObject {
	public static SObjectType$<ForecastingType> SObjectType;
	public static SObjectFields$<ForecastingType> Fields;

	public Boolean CanDisplayQuotas;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DateType;
	public String DeveloperName;
	public Boolean HasProductFamily;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsAmount;
	public Boolean IsDeleted;
	public Boolean IsPlatformType;
	public Boolean IsQuantity;
	public String Language;
	public Datetime LastActivatedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id OpportunitySplitTypeId;
	public OpportunitySplitType OpportunitySplitType;
	public String RoleType;
	public Datetime SystemModstamp;
	public Id Territory2ModelId;
	public Territory2Model Territory2Model;

	public ForecastingType clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
