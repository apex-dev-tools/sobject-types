/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class FeedPollChoice extends SObject {
	public static SObjectType$<FeedPollChoice> SObjectType;
	public static SObjectFields$<FeedPollChoice> Fields;

	public String ChoiceBody;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id FeedItemId;
	public SObject FeedItem;
	public Id Id;
	public Boolean IsDeleted;
	public Integer Position;

	public FeedPollVote[] FeedPollVotes;

	public FeedPollChoice clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeedPollChoice clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeedPollChoice clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeedPollChoice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeedPollChoice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
