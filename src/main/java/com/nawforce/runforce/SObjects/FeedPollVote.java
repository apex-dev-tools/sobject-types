/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

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

	public FeedPollVote clone$() {throw new UnsupportedOperationException();}
	public FeedPollVote clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public FeedPollVote clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public FeedPollVote clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public FeedPollVote clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
