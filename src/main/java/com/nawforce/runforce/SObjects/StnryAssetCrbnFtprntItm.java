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
public class StnryAssetCrbnFtprntItm extends SObject {
	public static SObjectType$<StnryAssetCrbnFtprntItm> SObjectType;
	public static SObjectFields$<StnryAssetCrbnFtprntItm> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal EnergyIntensityVariancePct;
	public Decimal EnrgyCnsmpIntensityInKwhM2;
	public Decimal EnrgyCnsmpIntensityInKwhSqft;
	public String FuelType;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id ParentCarbonFootprintId;
	public StnryAssetCrbnFtprnt ParentCarbonFootprint;
	public Id PrevYearCarbonFootprintItemId;
	public StnryAssetCrbnFtprntItm PrevYearCarbonFootprintItem;
	public Decimal PrevYrEnrgyIntensityKwhM2;
	public Decimal PrevYrEnrgyIntensityKwhSqft;
	public Datetime SystemModstamp;
	public Decimal TotEmssnUseMktBsdMthd;
	public Decimal TotalEmissionsInTco2e;
	public Decimal TotalEnergyConsumptionInGj;
	public Decimal TotalEnergyConsumptionInKwh;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public StnryAssetCrbnFtprntItmFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public StnryAssetCrbnFtprntItmHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public StnryAssetCrbnFtprntItm[] StationaryAssetCarbonFootprintsItem;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public StnryAssetCrbnFtprntItm clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntItm clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntItm clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntItm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntItm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
