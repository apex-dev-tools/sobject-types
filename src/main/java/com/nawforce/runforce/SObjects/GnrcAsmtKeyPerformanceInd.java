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
public class GnrcAsmtKeyPerformanceInd extends SObject {
	public static SObjectType$<GnrcAsmtKeyPerformanceInd> SObjectType;
	public static SObjectFields$<GnrcAsmtKeyPerformanceInd> Fields;

	public String ActualBooleanValue;
	public Datetime ActualDateTimeValue;
	public Decimal ActualDecimalValue;
	public Integer ActualIntegerValue;
	public Id AssessmentIndDefinitionId;
	public AssessmentIndicatorDefinition AssessmentIndDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DefinitionReferenceId;
	public GnrcAsmtKeyPerformanceInd DefinitionReference;
	public String ExpectedBooleanValue;
	public Datetime ExpectedDateTimeValue;
	public Decimal ExpectedDecimalValue;
	public Integer ExpectedIntegerValue;
	public Id GnrcAssessmentTaskContextId;
	public GenericAsmtTaskContext GnrcAssessmentTaskContext;
	public Id Id;
	public String ImplementorType;
	public Boolean IsDefinition;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer SequenceNumber;
	public Datetime SystemModstamp;

	public GnrcAsmtKeyPerformanceInd clone$() {throw new java.lang.UnsupportedOperationException();}
	public GnrcAsmtKeyPerformanceInd clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GnrcAsmtKeyPerformanceInd clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GnrcAsmtKeyPerformanceInd clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GnrcAsmtKeyPerformanceInd clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
