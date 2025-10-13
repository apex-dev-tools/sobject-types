/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class IntegrationJobRun extends SObject {
	public static SObjectType$<IntegrationJobRun> SObjectType;
	public static SObjectFields$<IntegrationJobRun> Fields;

	public Decimal ChangeEndRange;
	public Decimal ChangeStartRange;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndDateTime;
	public Id Id;
	public Boolean IsDeleted;
	public String JobAdditionalInfo;
	public String JobExectionSummary;
	public String JobIdentifier;
	public String JobName;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String Origin;
	public Id OwnerId;
	public Name Owner;
	public Datetime StartDateTime;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TotalRecordsFailed;
	public Decimal TotalRecordsProcessed;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public IntegrationJobRunFeed[] Feeds;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public IntegrationJobRunHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public IntegrationJobRunShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public IntegrationJobRun clone$() {throw new java.lang.UnsupportedOperationException();}
	public IntegrationJobRun clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationJobRun clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationJobRun clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationJobRun clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
