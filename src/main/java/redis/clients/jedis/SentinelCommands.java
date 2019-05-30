package redis.clients.jedis;

import java.util.List;
import java.util.Map;

/**
 * 哨兵客户端使用的命令
 */
public interface SentinelCommands {
  /**
   * sentinel masters
   * 查询主节点信息
   * @return
   */
  public List<Map<String, String>> sentinelMasters();

  /**
   * sentinel get-master-addr-by-name mymaster
   * 查询指定名称的主节点的ip和端口
   * @param masterName
   * @return
   */
  public List<String> sentinelGetMasterAddrByName(String masterName);

  /**
   *
   * @param pattern
   * @return
   */
  public Long sentinelReset(String pattern);

  /**
   *
   * @param masterName
   * @return
   */
  public List<Map<String, String>> sentinelSlaves(String masterName);

  /**
   *
   * @param masterName
   * @return
   */
  public String sentinelFailover(String masterName);

  /**
   *
   * @param masterName
   * @param ip
   * @param port
   * @param quorum
   * @return
   */
  public String sentinelMonitor(String masterName, String ip, int port, int quorum);

  /**
   *
   * @param masterName
   * @return
   */
  public String sentinelRemove(String masterName);

  /**
   *
   * @param masterName
   * @param parameterMap
   * @return
   */
  public String sentinelSet(String masterName, Map<String, String> parameterMap);
}
