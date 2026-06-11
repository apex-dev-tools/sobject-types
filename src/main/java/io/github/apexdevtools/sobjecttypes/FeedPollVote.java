/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class FeedPollVote extends SObject {
	public static SObjectType$<FeedPollVote> SObjectType;
	public static SObjectFields$<FeedPollVote> Fields;

	public Id ChoiceId;
	public FeedPollChoice Choice;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id FeedItemId;
	public SObject FeedItem;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime LastModifiedDate;

	public FeedPollVote clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeedPollVote clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeedPollVote clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeedPollVote clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeedPollVote clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
