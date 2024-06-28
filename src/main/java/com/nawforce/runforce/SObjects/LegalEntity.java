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
public class LegalEntity extends SObject {
	public static SObjectType$<LegalEntity> SObjectType;
	public static SObjectFields$<LegalEntity> Fields;

	public String CompanyName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Address LegalEntityAddress;
	public String LegalEntityCity;
	public String LegalEntityCountry;
	public String LegalEntityCountryCode;
	public String LegalEntityGeocodeAccuracy;
	public Decimal LegalEntityLatitude;
	public Decimal LegalEntityLongitude;
	public String LegalEntityPostalCode;
	public String LegalEntityState;
	public String LegalEntityStateCode;
	public String LegalEntityStreet;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String Status;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthorizedInsuranceLine[] AuthorizedInsuranceLines;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public LegalEntityFeed[] Feeds;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public LegalEntityHistory[] Histories;
	public InsurancePolicy[] IPUnderwritingEntity;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public LegalEntityShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public LegalEntity clone$() {throw new java.lang.UnsupportedOperationException();}
	public LegalEntity clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LegalEntity clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LegalEntity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LegalEntity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
