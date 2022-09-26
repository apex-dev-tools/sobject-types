/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ForecastingFilterCondition extends SObject {
	public static SObjectType$<ForecastingFilterCondition> SObjectType;
	public static SObjectFields$<ForecastingFilterCondition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String FieldName;
	public Id ForecastingFilterId;
	public ForecastingFilter ForecastingFilter;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String Operation;
	public Integer SortOrder;
	public Datetime SystemModstamp;
	public String Value;

	public ForecastingFilterCondition clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFilterCondition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFilterCondition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFilterCondition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFilterCondition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
