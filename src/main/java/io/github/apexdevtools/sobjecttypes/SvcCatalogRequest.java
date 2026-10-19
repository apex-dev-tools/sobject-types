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
public class SvcCatalogRequest extends SObject {
	public static SObjectType$<SvcCatalogRequest> SObjectType;
	public static SObjectFields$<SvcCatalogRequest> Fields;

	public Id CaseId;
	public Case Case;
	public String CatalogItemDescription;
	public String CatalogItemName;
	public String CatalogItemVersion;
	public Datetime ClosedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsClosed;
	public Boolean IsDeleted;
	public String ItemFlowVersion;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ReferenceObjectId;
	public Name ReferenceObject;
	public String Status;
	public Id SubmitterId;
	public User Submitter;
	public Id SvcCatalogItemDefinitionId;
	public SvcCatalogItemDef SvcCatalogItemDefinition;
	public Datetime SystemModstamp;
	public Id TargetCustomerId;
	public Name TargetCustomer;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Case[] Cases;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public SvcCatalogRequestHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SvcCatalogRequestShare[] Shares;

	public SvcCatalogRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
