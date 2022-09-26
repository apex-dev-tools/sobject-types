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
public class MaintenanceWorkRuleChangeEvent extends SObject {
	public static SObjectType$<MaintenanceWorkRuleChangeEvent> SObjectType;
	public static SObjectFields$<MaintenanceWorkRuleChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Date NextSuggestedMaintenanceDate;
	public Id OwnerId;
	public User Owner;
	public Id ParentMaintenancePlanId;
	public MaintenancePlan ParentMaintenancePlan;
	public Id ParentMaintenanceRecordId;
	public MaintenanceAsset ParentMaintenanceRecord;
	public Id RecordsetFilterCriteriaId;
	public RecordsetFilterCriteria RecordsetFilterCriteria;
	public String RecurrencePattern;
	public String ReplayId;
	public Integer SortOrder;
	public String Title;
	public String Type;
	public Id WorkTypeId;
	public WorkType WorkType;

	public MaintenanceWorkRuleChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceWorkRuleChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceWorkRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceWorkRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceWorkRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
