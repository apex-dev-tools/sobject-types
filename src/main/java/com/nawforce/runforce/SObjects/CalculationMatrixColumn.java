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
public class CalculationMatrixColumn extends SObject {
	public static SObjectType$<CalculationMatrixColumn> SObjectType;
	public static SObjectFields$<CalculationMatrixColumn> Fields;

	public String ApiName;
	public Id CalculationMatrixId;
	public CalculationMatrix CalculationMatrix;
	public String ColumnType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataType;
	public Integer DisplaySequence;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsWildcardColumn;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Namespace;
	public String RangeValues;
	public Datetime SystemModstamp;
	public String WildcardColumnValue;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CalcMatrixColumnRange[] CalcMatrixColumnRanges;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public PricingProcedureOutputMap[] DecisionOutputColumn;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CalculationMatrixColumnFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CalculationMatrixColumnHistory[] Histories;

	public CalculationMatrixColumn clone$() {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixColumn clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixColumn clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixColumn clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixColumn clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
