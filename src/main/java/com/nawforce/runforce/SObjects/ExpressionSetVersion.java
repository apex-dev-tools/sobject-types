/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ExpressionSetVersion extends SObject {
	public static SObjectType$<ExpressionSetVersion> SObjectType;
	public static SObjectFields$<ExpressionSetVersion> Fields;

	public String ApiName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EndDateTime;
	public Id ExpressionSetDefinitionVerId;
	public ExpressionSetDefinitionVersion ExpressionSetDefinitionVer;
	public Id ExpressionSetId;
	public ExpressionSet ExpressionSet;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsLoopingEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LatestSimulationResult;
	public String LoopEndVariableName;
	public String LoopIncrementVariableName;
	public String LoopStartVariableName;
	public String Name;
	public Integer Rank;
	public Boolean ShouldShowExplExternally;
	public Datetime StartDateTime;
	public Datetime SystemModstamp;
	public Integer VersionNumber;

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
	public ExpressionSetVersionFeed[] Feeds;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ExpressionSetVersionHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ExpressionSetVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
