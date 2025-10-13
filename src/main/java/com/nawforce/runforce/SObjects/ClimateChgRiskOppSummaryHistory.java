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
public class ClimateChgRiskOppSummaryHistory extends SObject {
	public static SObjectType$<ClimateChgRiskOppSummaryHistory> SObjectType;
	public static SObjectFields$<ClimateChgRiskOppSummaryHistory> Fields;

	public Id ClimateChgRiskOppSummaryId;
	public ClimateChgRiskOppSummary ClimateChgRiskOppSummary;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;

	public ClimateChgRiskOppSummaryHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummaryHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummaryHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummaryHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummaryHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
