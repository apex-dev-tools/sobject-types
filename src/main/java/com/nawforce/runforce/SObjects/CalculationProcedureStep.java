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
public class CalculationProcedureStep extends SObject {
	public static SObjectType$<CalculationProcedureStep> SObjectType;
	public static SObjectFields$<CalculationProcedureStep> Fields;

	public Id CalculationMatrixId;
	public CalculationMatrix CalculationMatrix;
	public String CalculationMatrixType;
	public String CalculationProcedure;
	public Id CalculationProcedureVersionId;
	public CalculationProcedureVersion CalculationProcedureVersion;
	public String ConditionsConvertedText;
	public String ConditionsExpressionText;
	public String ConditionsUiFormattedText;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DecisionTableId;
	public DecisionTable DecisionTable;
	public String Description;
	public String FormulaConvertedText;
	public String FormulaExpressionText;
	public String FormulaUiFormattedText;
	public Id Id;
	public String InputVariablesFormatText;
	public Boolean IsConditionalStep;
	public Boolean IsDeleted;
	public Boolean IsResultIncluded;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Namespace;
	public String OutputVariablesFormatText;
	public String OutputVariablesMappingText;
	public Id ReferenceProcedureId;
	public CalculationProcedure ReferenceProcedure;
	public String ReturnMessageValueSet;
	public String Stage;
	public Integer StageStepSequence;
	public String StepType;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CalcProcStepRelationship[] CalcProcStepRelationships;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CalculationProcedureStepFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CalculationProcedureStepHistory[] Histories;
	public CalcProcStepRelationship[] ParentCalcProcStepRelationships;

	public CalculationProcedureStep clone$() {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureStep clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureStep clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureStep clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureStep clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
