/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ConvDefSessionMetric extends SObject {
	public static SObjectType$<ConvDefSessionMetric> SObjectType;
	public static SObjectFields$<ConvDefSessionMetric> Fields;

	public Integer ArticleChosenCount;
	public Integer ChoiceSelectionCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer GlobalChoiceSelectionCount;
	public Id Id;
	public Integer InputMessageCount;
	public Integer InterruptedDialogCount;
	public Boolean IsDeleted;
	public String LastDialog;
	public String LastDialogName;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer NlpIntentRequestCount;
	public Integer NlpIntentRequestHitCount;
	public Integer OutputMessageCount;
	public Id ParentId;
	public ConversationDefinitionSession Parent;
	public Integer StartedDialogCount;
	public Datetime SystemModstamp;
	public Integer TransferWaitTime;
	public Boolean WasSessionDropped;

	public ConvDefSessionMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConvDefSessionMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConvDefSessionMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConvDefSessionMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConvDefSessionMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
