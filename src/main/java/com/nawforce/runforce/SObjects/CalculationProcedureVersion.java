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
public class CalculationProcedureVersion extends SObject {
	public static SObjectType$<CalculationProcedureVersion> SObjectType;
	public static SObjectFields$<CalculationProcedureVersion> Fields;

	public Id CalculationProcedureId;
	public CalculationProcedure CalculationProcedure;
	public String Constants;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EndDateTime;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public Boolean IsLoopingEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastSimulatedVariablesInput;
	public String LoopEnd;
	public String LoopIncrement;
	public String LoopStart;
	public String Name;
	public String Namespace;
	public Integer Rank;
	public Datetime StartDateTime;
	public Datetime SystemModstamp;
	public Integer VersionNumber;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CalcProcStepRelationship[] CalcProcStepRelationships;
	public CalculationProcedureStep[] CalculationProcedureSteps;
	public CalculationProcedureVariable[] CalculationProcedureVariables;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CalculationProcedureVersionFeed[] Feeds;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CalculationProcedureVersionHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CalculationProcedureVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
