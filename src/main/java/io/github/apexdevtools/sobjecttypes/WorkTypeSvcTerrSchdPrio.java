/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WorkTypeSvcTerrSchdPrio extends SObject {
	public static SObjectType$<WorkTypeSvcTerrSchdPrio> SObjectType;
	public static SObjectFields$<WorkTypeSvcTerrSchdPrio> Fields;

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
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentServiceTerritoryId;
	public ServiceTerritory ParentServiceTerritory;
	public Integer Priority;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public Datetime SystemModstamp;
	public String UsageType;
	public Id WorkProcedureId;
	public WorkProcedure WorkProcedure;
	public Id WorkTypeId;
	public WorkType WorkType;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkTypeSvcTerrSchdPrioFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public WorkTypeSvcTerrSchdPrioHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkTypeSvcTerrSchdPrioShare[] Shares;

	public WorkTypeSvcTerrSchdPrio clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeSvcTerrSchdPrio clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeSvcTerrSchdPrio clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeSvcTerrSchdPrio clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeSvcTerrSchdPrio clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
