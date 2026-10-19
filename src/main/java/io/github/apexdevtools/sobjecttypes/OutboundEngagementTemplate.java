/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class OutboundEngagementTemplate extends SObject {
	public static SObjectType$<OutboundEngagementTemplate> SObjectType;
	public static SObjectFields$<OutboundEngagementTemplate> Fields;

	public String BusinessArea;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public String Purpose;
	public String Status;
	public Datetime SystemModstamp;
	public String TargetName;
	public String TargetType;
	public String TemplateCategory;
	public String TemplateDescription;
	public String TemplateDeveloperName;
	public String TemplateName;
	public Id TemplateReferenceRecordId;
	public Campaign TemplateReferenceRecord;
	public String TemplateSubcategory;
	public String TemplateType;
	public String UsageType;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public OutboundEngagementTemplateShare[] Shares;

	public OutboundEngagementTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngagementTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngagementTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngagementTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngagementTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
