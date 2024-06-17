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
public class CalculationMatrix extends SObject {
	public static SObjectType$<CalculationMatrix> SObjectType;
	public static SObjectFields$<CalculationMatrix> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DecisionMatrixDefinitionId;
	public Name DecisionMatrixDefinition;
	public String DecisionMatrixType;
	public String Description;
	public String GroupKey;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MigrationStatus;
	public String Name;
	public String Namespace;
	public Id OwnerId;
	public Name Owner;
	public String SubGroupKey;
	public Datetime SystemModstamp;
	public String Type;
	public String UniqueName;
	public String UsageType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CalculationMatrixColumn[] CalculationMatrixColumns;
	public CalculationMatrixVersion[] CalculationMatrixVersions;
	public CalculationProcedureStep[] CalculationProcedureSteps;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CalculationMatrixFeed[] Feeds;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CalculationMatrixHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public CalculationMatrixShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CalculationMatrix clone$() {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrix clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrix clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrix clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrix clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
