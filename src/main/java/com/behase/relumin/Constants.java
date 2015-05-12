package com.behase.relumin;

import com.google.common.base.Joiner;

public class Constants {
	private Constants() {
	};

	public static final int ALL_SLOTS_SIZE = 16384;

	public static final String REDIS_PREFIX = "_relumin";

	public static final String ERR_CODE_INVALID_PARAMETER = "400_000";
	public static final String ERR_CODE_REDIS_SET_FAILED = "500_000";
	public static final String ERR_CODE_ALL_NODE_DOWN = "500_001";
	public static final String ERR_CODE_CLUSTER_NOT_AGREE_CONFIG = "500_002";
	public static final String ERR_CODE_CLUSTER_HAS_OPEN_SLOTS = "500_003";
	public static final String ERR_CODE_UNKNOWN = "500_999";

	public static String getClustersKey() {
		return Joiner.on(".").join(REDIS_PREFIX, "clusters").toString();
	}

	public static String getClusterKey(String clusterName) {
		return Joiner.on(".").join(REDIS_PREFIX, "cluster", clusterName).toString();
	}

	public static String getNodeKey(String clusterName, String nodeId) {
		return Joiner.on(".").join(REDIS_PREFIX, "cluster", clusterName, "node", nodeId).toString();
	}

	public static String getNodeStaticsInfoKey(String clusterName, String nodeId) {
		return Joiner.on(".").join(REDIS_PREFIX, "cluster", clusterName, "node", nodeId, "staticsInfo").toString();
	}
}
