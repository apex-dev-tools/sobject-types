/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PartnerMarketingBudgetHistory extends SObject {
	public static SObjectType$<PartnerMarketingBudgetHistory> SObjectType;
	public static SObjectFields$<PartnerMarketingBudgetHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;
	public Id PartnerMarketingBudgetId;
	public PartnerMarketingBudget PartnerMarketingBudget;

	public PartnerMarketingBudgetHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public PartnerMarketingBudgetHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PartnerMarketingBudgetHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PartnerMarketingBudgetHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PartnerMarketingBudgetHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
