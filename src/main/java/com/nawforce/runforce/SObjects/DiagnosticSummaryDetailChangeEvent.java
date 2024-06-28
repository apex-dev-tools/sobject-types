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
public class DiagnosticSummaryDetailChangeEvent extends SObject {
	public static SObjectType$<DiagnosticSummaryDetailChangeEvent> SObjectType;
	public static SObjectFields$<DiagnosticSummaryDetailChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DetailRecordId;
	public SObject DetailRecord;
	public String DetailType;
	public Id DiagnosticSummaryId;
	public DiagnosticSummary DiagnosticSummary;
	public String Division;
	public String DocumentRelationType;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;

	public DiagnosticSummaryDetailChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummaryDetailChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummaryDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummaryDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummaryDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
