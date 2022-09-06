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
public class WorkPlanTemplateEntryChangeEvent extends SObject {
	public static SObjectType$<WorkPlanTemplateEntryChangeEvent> SObjectType;
	public static SObjectFields$<WorkPlanTemplateEntryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer ExecutionOrder;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ReplayId;
	public String WorkPlanTemplateEntryNumber;
	public Id WorkPlanTemplateId;
	public WorkPlanTemplate WorkPlanTemplate;
	public Id WorkStepTemplateId;
	public WorkStepTemplate WorkStepTemplate;

	public WorkPlanTemplateEntryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanTemplateEntryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanTemplateEntryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanTemplateEntryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanTemplateEntryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
