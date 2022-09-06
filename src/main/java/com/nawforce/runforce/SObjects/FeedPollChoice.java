/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
